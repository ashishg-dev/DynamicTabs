package dev.ashish.dynamictabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        tabLayout = findViewById<TabLayout>(R.id.sliding_tabs)
        setSupportActionBar(toolbar)

        val mSectionsPagerAdapter = ViewPagerAdapter(supportFragmentManager, getDetails())
        container.adapter = mSectionsPagerAdapter

        tabLayout.setupWithViewPager(container)
        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container))

    }

    private fun getDetails(): ArrayList<HashMap<String, String>> {

        val data = ArrayList<HashMap<String, String>>()

        val actor1 = HashMap<String, String>()
        actor1["name"] = "Amitabh Bachchan"
        actor1["description"] =
            "Being the son of a Hindi poet, he is known for his works from the early 1970s in " +
                    "the Bollywood film industry, has appeared in over 190 Indian films in a career " +
                    "spanning almost five decades. His last name, Bachchan, was his father’s pen name, " +
                    "meaning “child-like”."
        data.add(actor1)

        val actor2 = HashMap<String, String>()
        actor2["name"] = "Jackie"
        actor2["description"] =
            "His full name is Jai Kishan Kakubhai “Jackie” Shroff. He has played many " +
                    "significant roles in more than 220 films in eleven languages."
        data.add(actor2)

        val actor3 = HashMap<String, String>()
        actor3["name"] = "Hrithik Roshan"
        actor3["description"] =
            "The world’s most handsome man, Hrithik Roshan is one of the most talented actors " +
                    "and dancers in Bollywood. His father Rakesh Roshan, has himself been a star in " +
                    "the 70s and 80s. His first movie was “Kaho Naa… Pyaar Hai (2000)”."
        data.add(actor3)

        val actor4 = HashMap<String, String>()
        actor4["name"] = "Salman Khan"
        actor4["description"] =
            "One of the top 10 most handsome men in the world, Salman Khan started his career as a " +
                    "supporting actor in Biwi Ho Toh Aisi (1988). He made his debut in 1989 " +
                    "romantic hit Maine Pyaar Kia. Known as ‘bhai’ to many, he has starred in some " +
                    "of the biggest grossing Bollywood films."
        data.add(actor4)

        val actor5 = HashMap<String, String>()
        actor5["name"] = "Anil Kapoor"
        actor5["description"] = "Having a career span of more than 40 years, Anil Kapoor is widely " +
                "known for his works in movies like Mr India (1987), Tezaab (1988) and Race (2008)." +
                "  But over the last few years, his fame with the Oscar-winning Slumdog Millionaire," +
                " Mission Impossible and TV show remakes like 24 has earned him a reputation in Hollywood too."

        data.add(actor5)

        return data

    }
}
