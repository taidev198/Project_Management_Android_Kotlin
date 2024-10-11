package com.taidev198.project138.ui.profile

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taidev198.project138.data.model.Archive
import com.taidev198.project138.databinding.CardArchiveBinding
import com.taidev198.project138.utils.listener.OnItemClickListener

class ArchiveAdapter(
    private var listener: OnItemClickListener,
    private var context: Context
): RecyclerView.Adapter<ArchiveAdapter.ViewHolder>() {

    private val mListArchives by lazy { mutableListOf<Archive>() }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(CardArchiveBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int {
       return mListArchives.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    fun updateData(_allArchives: List<Archive>){
        mListArchives.clear()
        mListArchives.addAll(_allArchives)
        notifyDataSetChanged()
    }

    inner class ViewHolder(
        private val binding: CardArchiveBinding
    ): RecyclerView.ViewHolder(binding.root) {

        fun bindData(newItem: Archive, holder: ViewHolder){

        }
    }
}