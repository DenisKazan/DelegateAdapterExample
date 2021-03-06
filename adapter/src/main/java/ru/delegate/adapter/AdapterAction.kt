package ru.delegate.adapter

import androidx.recyclerview.widget.RecyclerView

interface AdapterAction<in M, in H : RecyclerView.ViewHolder> {
    fun bind(model: M, viewHolder: H)
}

class OnRootClickAdapterAction<in M, in H : RecyclerView.ViewHolder>(private val onClickListener: (M)-> Unit) : AdapterAction<M, H> {
    override fun bind(model: M, viewHolder: H) {
        viewHolder.itemView.setOnClickListener { onClickListener.invoke(model) }
    }
}
