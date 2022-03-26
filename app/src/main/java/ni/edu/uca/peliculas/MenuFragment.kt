package ni.edu.uca.peliculas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ni.edu.uca.peliculas.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    lateinit var fBinding: FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fBinding = FragmentMenuBinding.inflate(layoutInflater)
        return fBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fBinding.BtnClasificacion.setOnClickListener{
            it.findNavController().navigate(R.id.irAClasificacion)
        }

        fBinding.BtnGenero.setOnClickListener {
            it.findNavController().navigate(R.id.irAGenero)
        }

        fBinding.BtnIdioma.setOnClickListener {
            it.findNavController().navigate(R.id.irAIdioma)
        }

        fBinding.BtnNacionalidad.setOnClickListener {
            it.findNavController().navigate(R.id.irANacionalidad)
        }

        fBinding.BtnPelicula.setOnClickListener {
            it.findNavController().navigate(R.id.irAPelicula)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MenuFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MenuFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}