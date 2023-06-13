package uniza.fri.vamz.maga.APUZK.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import uniza.fri.vamz.maga.APUZK.databinding.FragmentOffersBinding
import uniza.fri.vamz.maga.APUZK.ui.offers.OffersViewModel

class SettingsFragment : Fragment() {

    private var _binding: FragmentOffersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val offersViewModel =
            ViewModelProvider(this).get(SettingsViewModel::class.java)

        _binding = FragmentOffersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}