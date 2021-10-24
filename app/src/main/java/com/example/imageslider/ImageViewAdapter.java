package com.example.imageslider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.Objects;

class ImageViewAdapter extends PagerAdapter{

     Context context;

     int[] images;


     LayoutInflater mLayoutInflater;


     public ImageViewAdapter(Context context, int[] images) {
         this.context = context;
         this.images = images;
         mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
     }

     @Override
     public int getCount() {

         return images.length;

     }

     @Override
     public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
         return view == ((LinearLayout) object);
     }

     @NonNull
     @Override
     public Object instantiateItem(@NonNull ViewGroup container, final int position) {

         View itemView = mLayoutInflater.inflate(R.layout.container, container, false);


         ImageView imageView = (ImageView) itemView.findViewById(R.id.imageview1);

         imageView.setImageResource(images[position]);

         Objects.requireNonNull(container).addView(itemView);

         return itemView;
     }
     @Override
     public void destroyItem(ViewGroup container, int position, Object object) {

         container.removeView((LinearLayout) object);
     }
 }



