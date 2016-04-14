package com.justineangelo888.mangareader888;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by justine on 13/04/16.
 */
public class SiteListGridViewAdapter extends BaseAdapter {
    public List<String> siteListNames;

    //Initializer
    public SiteListGridViewAdapter() {
        siteListNames = Arrays.asList();
    }

    @Override
    public int getCount() {
        return siteListNames.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            textView = new TextView(((Context)SiteList.instance));
            textView.setLayoutParams(new GridView.LayoutParams(CommonUtil.getScreenSize().widthPixels/3 - 16, 200));
            textView.setPadding(8, 8, 8, 8);
            textView.setBackgroundColor(Color.CYAN);
            Log.i(this.getClass().toString(),"test");
        } else {
            Log.i(this.getClass().toString(), "test1");
            textView = (TextView) convertView;
        }
        textView.setText(siteListNames.get(position));
        return textView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
