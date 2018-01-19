package sk.styk.martin.apkanalyzer.activity.detailfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import sk.styk.martin.apkanalyzer.R
import sk.styk.martin.apkanalyzer.activity.AppDetailFragment
import sk.styk.martin.apkanalyzer.adapter.detaillist.ProviderListAdapter
import sk.styk.martin.apkanalyzer.model.detail.ContentProviderData

/**
 * @author Martin Styk
 * @version 30.06.2017.
 */
class AppDetailFragment_Provider : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_app_detail_provider, container, false)

        val data = arguments.getParcelableArrayList<ContentProviderData>(AppDetailFragment.ARG_CHILD)

        val recyclerView = rootView.findViewById<RecyclerView>(R.id.recycler_view_provider)

        val adapter = ProviderListAdapter(data!!)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

        return rootView
    }
}
