package com.taidev198.project138.ui.home

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taidev198.project138.data.model.Ongoing
import com.taidev198.project138.databinding.CardJobBinding
import com.taidev198.project138.utils.listener.OnItemClickListener

class OngoingAdapter(
    private var listener: OnItemClickListener,
    private val context: Context
): RecyclerView.Adapter<OngoingAdapter.ViewHolder>() {

    private val mListener by lazy { mutableListOf<Ongoing>() }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(CardJobBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int {
        return mListener.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(mListener[position], holder)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(listOngoing: List<Ongoing>) {
        mListener.clear()
        mListener.addAll(listOngoing)
        notifyDataSetChanged()
    }

    inner class ViewHolder(
        private val binding: CardJobBinding
    ): RecyclerView.ViewHolder(binding.root) {

        var title = binding.tvTitle.text
        var date = binding.date.text
        var progress = binding.tvPercent.text
        var picPath = binding.pic

        fun bindData(newItem: Ongoing, holder: ViewHolder){
            title = newItem.title
            date = newItem.date
            progress = newItem.progress.toString()
            val resourceId =
                holder.itemView.resources.getIdentifier(
                    newItem.picPath,
                    "drawable",
                    context.packageName)
            picPath.setImageResource(resourceId)
        }
    }
}