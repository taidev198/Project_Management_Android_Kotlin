package com.taidev198.project138.ui.profile

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taidev198.project138.data.model.Team
import com.taidev198.project138.databinding.CardTeamBinding
import com.taidev198.project138.utils.listener.OnItemClickListener

class TeamAdapter(
    private val listener: OnItemClickListener,
    private val context: Context
): RecyclerView.Adapter<TeamAdapter.ViewHolder>() {

    private val allTeams by lazy { mutableListOf<Team>() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(CardTeamBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int {
        return allTeams.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    fun updateData(_allTeams: List<Team>) {
        allTeams.clear()
        allTeams.addAll(_allTeams)
        notifyDataSetChanged()
    }

    inner class ViewHolder(
        private val binding: CardTeamBinding
    ): RecyclerView.ViewHolder(binding.root) {

        fun bindData(newItem: Team, viewHolder: ViewHolder){

        }

    }
}