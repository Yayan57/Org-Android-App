package com.example.shpeapp.ui.events

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import com.example.shpeapp.R
import com.example.shpeapp.data.Event
import java.util.*

class EventAdapter(private val eventList: List<Event>) : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)
        return EventViewHolder(itemView)
    }
    private val dateFormat = SimpleDateFormat("dd MMM yyyy, HH:mm", Locale.getDefault())


    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val currentEvent = eventList[position]
        holder.eventTitle.text = currentEvent.title
        holder.eventDetail.text = currentEvent.detail
        holder.eventDateTime.text = dateFormat.format(Date(currentEvent.dateTime))
        holder.eventLocation.text = currentEvent.location
        holder.eventSigninLink.text = currentEvent.signInLink
    }

    override fun getItemCount() = eventList.size

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val eventTitle: TextView = itemView.findViewById(R.id.eventTitle)
        val eventDetail: TextView = itemView.findViewById(R.id.eventDetail)
        val eventDateTime: TextView = itemView.findViewById(R.id.eventDateTime)
        val eventLocation: TextView = itemView.findViewById(R.id.eventLocation)
        val eventSigninLink: TextView = itemView.findViewById(R.id.eventSigninLink)
    }
}
