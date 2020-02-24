package com.laioffer.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import android.content.res.Configuration;


public class MainActivity extends AppCompatActivity implements EventFragment.OnItemSelectListener,
        CommentFragment.OnItemSelectListener{
    private EventFragment listFragment;
    private CommentFragment gridFragment;

    @Override
    public void onItemSelected(int position) {
        if (!isTablet()) {
            Fragment fragment = CommentFragment.newInstance(position);
            getSupportFragmentManager().beginTransaction().replace(R.id.event_container, fragment).addToBackStack(null).commit();
        } else {
            gridFragment.onItemSelected(position);
        }

    }

    @Override
    public void onCommentSelected(int position) {
        listFragment.onItemSelected(position);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Life cycle test", "We are at onCreated()");

        if (getSupportFragmentManager().findFragmentById(R.id.event_container) == null) {
            listFragment = new EventFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.event_container, listFragment).commit();
        } else {
            listFragment = (EventFragment) getSupportFragmentManager().findFragmentById(R.id.event_container);
        }

        //add Gridview
        if (getSupportFragmentManager().findFragmentById(R.id.comment_container) == null && isTablet()) {
            gridFragment = new CommentFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.comment_container, gridFragment).commit();
        } else {
            gridFragment = (CommentFragment) getSupportFragmentManager().findFragmentById(R.id.comment_container);
        }

    }
    private boolean isTablet() {
        return (getApplicationContext().getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) >=
                Configuration.SCREENLAYOUT_SIZE_LARGE;
    }





}
