package com.goodbit.terapia.view.entrada

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.goodbit.terapia.databinding.FragmentEntradaBinding
import com.goodbit.terapia.viewmodel.EntradaViewModel


class EntradaFragment : Fragment() {

    private var _binding: FragmentEntradaBinding? = null

    private val binding get() = _binding!!
    private lateinit var entradaViewModel: EntradaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         entradaViewModel =
            ViewModelProvider(this).get(EntradaViewModel::class.java)

        _binding = FragmentEntradaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        entradaViewModel.getAll()

        observe()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    fun observe(){
        entradaViewModel.problemas.observe(viewLifecycleOwner) {

        }
    }
}