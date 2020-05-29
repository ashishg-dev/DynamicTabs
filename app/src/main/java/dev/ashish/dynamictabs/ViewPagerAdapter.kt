package dev.ashish.dynamictabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(
    private val fragmentManager: FragmentManager,
    private val data: ArrayList<HashMap<String,String>>
) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {

        return TabFragment.newInstance(data[position]["description"].toString())

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return data[position]["name"].toString()
    }

    override fun getCount(): Int {
        return data.size
    }

}