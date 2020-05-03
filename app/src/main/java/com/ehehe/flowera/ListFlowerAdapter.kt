package com.ehehe.flowera

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFlowerAdapter(private val listFlower: ArrayList<Flower>): RecyclerView.Adapter<ListFlowerAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback{
        fun onItemClicked(data: Flower)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_flower, viewGroup, false)
        return ListViewHolder(view)
        val lihat: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.profile_item, viewGroup, false)
        return ListViewHolder(lihat)
    }

    override fun getItemCount(): Int {
        return listFlower.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val flower = listFlower[position]
        Glide.with(holder.itemView.context)
            .load(flower.photo)
            .apply(RequestOptions().override(140,100))
            .into(holder.imgPhoto)

        val mContext = holder.itemView.context

        holder.tvName.text = flower.name
        holder.tvDetail.text = flower.detail
        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, DetailFlower::class.java)
            moveDetail.putExtra(DetailFlower.EXTRA_NAME, flower.name)
            moveDetail.putExtra(DetailFlower.EXTRA_DETAIL, flower.detail)
            moveDetail.putExtra(DetailFlower.EXTRA_PHOTO, flower.photo)
            mContext.startActivity(moveDetail)
        }


    }
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}