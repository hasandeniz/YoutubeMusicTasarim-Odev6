package com.hasandeniz.youtubemusic

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hasandeniz.youtubemusic.databinding.CardTasarimBinding


class SarkiAdapter(var mContext:Context, var sarkiListesi:List<Sarki>)
    : RecyclerView.Adapter<SarkiAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(binding: CardTasarimBinding) : RecyclerView.ViewHolder(binding.root){
        var binding:CardTasarimBinding
        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val sarki = sarkiListesi[position]
        val b = holder.binding
        b.tvNumber.text = "${position + 1}"
        b.tvSongName.text = sarki.songName
        b.tvSubText.text = sarki.subText

    }


    override fun getItemCount(): Int {
        return sarkiListesi.size
    }
}