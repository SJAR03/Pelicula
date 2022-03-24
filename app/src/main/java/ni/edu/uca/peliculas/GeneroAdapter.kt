package ni.edu.uca.peliculas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.peliculas.databinding.ItemClasificacionBinding
import ni.edu.uca.peliculas.databinding.ItemGeneroBinding
import ni.edu.uca.peliculas.models.ClasificacionItem
import ni.edu.uca.peliculas.models.Genero
import ni.edu.uca.peliculas.models.GeneroItem

class GeneroAdapter(val generoLista : List<GeneroItem>):RecyclerView.Adapter<GeneroAdapter.GeneroHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneroHolder {
        val binding = ItemGeneroBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return GeneroHolder(binding)
    }

    override fun onBindViewHolder(holder: GeneroAdapter.GeneroHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class GeneroHolder(val binding : ItemGeneroBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(genero: GeneroItem){
            with(binding){
                TxtId.text = genero.idGenero.toString()
                TxtNombre.text = genero.nombre
            }
        }
    }

}