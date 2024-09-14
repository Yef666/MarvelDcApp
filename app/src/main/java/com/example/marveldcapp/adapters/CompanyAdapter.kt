package com.example.marveldcapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marveldcapp.R
import com.example.marveldcapp.models.Company
import com.squareup.picasso.Picasso

class CompanyAdapter(
    private val companyList: List<Company>,
    private val onClick: (Company) -> Unit
) : RecyclerView.Adapter<CompanyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.company_item, parent, false)
        return CompanyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return companyList.size
    }

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
        val company = companyList[position]
        holder.companyName.text = company.name
        Picasso.get().load(company.image).into(holder.companyImage)
        holder.itemView.setOnClickListener {
            onClick(company)
        }
    }
}

class CompanyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val companyName: TextView = view.findViewById(R.id.company_name)
    val companyImage: ImageView = view.findViewById(R.id.company_image)
}
