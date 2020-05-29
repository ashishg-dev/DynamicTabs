package dev.ashish.dynamictabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class TabFragment : Fragment() {

    private lateinit var data : String

    companion object {
        fun newInstance(data: String): TabFragment {
            val obj = TabFragment()
            val bundle = Bundle()
            bundle.putString("data", data)
            obj.arguments = bundle
            return obj
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        data = arguments!!.getString("data").toString()

        return inflater.inflate(R.layout.fragment_tab, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textView)

        textView.text = data

    }

}
