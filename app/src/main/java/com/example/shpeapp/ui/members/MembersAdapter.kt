package com.example.shpeapp.ui.members

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shpeapp.R

class MembersAdapter(private val members: List<Member>) : RecyclerView.Adapter<MembersAdapter.MemberViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_member, parent, false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.bind(members[position])
    }

    override fun getItemCount(): Int {return members.size}

    class MemberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewMajor: TextView = itemView.findViewById(R.id.textViewMajor)
        val textViewGraduation: TextView = itemView.findViewById(R.id.textViewGraduation)

        fun bind(member: Member) {
            imageView.setImageResource(member.imageResId)
            textViewName.text = member.name
            textViewMajor.text = member.major
            textViewGraduation.text = member.graduation
        }
    }
}
