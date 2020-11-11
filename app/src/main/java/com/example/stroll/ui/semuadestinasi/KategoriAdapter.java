package com.example.stroll.ui.semuadestinasi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.stroll.R;
import com.example.stroll.model.Kategori;

import java.util.ArrayList;
import java.util.List;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.ViewHolder> {
    private List<Kategori> listCourses = new ArrayList<>();

    void setCourses(List<Kategori> listCourses) {
        if (listCourses == null) return;
        this.listCourses.clear();
        this.listCourses.addAll(listCourses);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_kategori, parent, false);
        return new ViewHolder(view);
    }
//dsfdsf
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Kategori course = listCourses.get(position);
        holder.bind(course);
    }

    @Override
    public int getItemCount() {
        return listCourses.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;

        ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.namaKategori);
        }

        void bind(Kategori course) {
            tvTitle.setText(course.getNamaKategori());
            itemView.setOnClickListener(v -> {

                KategoriFragment semuaDestinasiFragment = new KategoriFragment();
                Bundle mBundle = new Bundle();
                mBundle.putString("name", course.getNamaKategori());
                semuaDestinasiFragment.setArguments(mBundle);

                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, semuaDestinasiFragment)
                        .addToBackStack(null).commit();
            });
        }
    }
}