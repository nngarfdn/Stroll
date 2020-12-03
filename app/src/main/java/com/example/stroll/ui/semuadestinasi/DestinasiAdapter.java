package com.example.stroll.ui.semuadestinasi;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stroll.R;
import com.example.stroll.model.Destinasi;
import com.example.stroll.ui.detail.DetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DestinasiAdapter extends RecyclerView.Adapter<DestinasiAdapter.ViewHolder> {
    private final List<Destinasi> listCourses = new ArrayList<>();

    public void setCourses(List<Destinasi> listCourses) {
        if (listCourses == null) return;
        this.listCourses.clear();
        this.listCourses.addAll(listCourses);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wisata, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Destinasi course = listCourses.get(position);
        holder.bind(course);
    }

    @Override
    public int getItemCount() {
        return listCourses.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final TextView tvDeskripsi;
        TextView tvAlamat;
        ImageView imgDestinasi;

        ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.txtNamaDestinasiItem);
            tvDeskripsi = itemView.findViewById(R.id.txtDeskripsiDesItem);
            tvAlamat = itemView.findViewById(R.id.txtAlamatDestinasi);
            imgDestinasi = itemView.findViewById(R.id.imgItemWisata);
        }

        void bind(Destinasi destinasi) {
            tvTitle.setText(destinasi.getNamaDestinasi());
            tvDeskripsi.setText(destinasi.getDeskripsiDestinasi());
            tvAlamat.setText(destinasi.getAlamatDestinasi());

            Picasso.get()
                    .load(destinasi.getPhotoDestinasi())
                    .resize(100, 100)
                    .centerCrop()// resizes the image to these dimensions (in pixel)
                    .into(imgDestinasi);
            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_DESTINASI, destinasi);
                itemView.getContext().startActivity(intent);
            });
        }
    }
}