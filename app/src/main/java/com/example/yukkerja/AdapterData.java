package com.example.yukkerja;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.ViewHolder> {

   private ArrayList<Model> courseModalArrayList;
    private Context context;

    // creating a constructor for our variables.
    public AdapterData(ArrayList<Model> courseModalArrayList, Context context) {
        this.courseModalArrayList = courseModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterData.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // below line is to inflate our layout.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterData.ViewHolder holder, int position) {
        // setting data to our views of recycler view.
        Model modal = courseModalArrayList.get(position);
        holder.company.setText(modal.getCourseName());
        holder.job.setText(modal.getCourseMode());
        Picasso.get().load(modal.getCourseimg()).into(holder.logo);
    }

    @Override
    public int getItemCount() {
        // returning the size of array list.
        return courseModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // creating variables for our views.
        private TextView company, job;
        private ImageView logo;
        private Button btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // initializing our views with their ids.
            company = itemView.findViewById(R.id.idTVCourseName);
            job = itemView.findViewById(R.id.idTVCourseDescription);
            logo = itemView.findViewById(R.id.logoPT);
            btnDetail = itemView.findViewById(R.id.btndetail);
            btnDetail.setBackgroundColor(Color.TRANSPARENT);
        }
    }
}
