package sk.styk.martin.apkanalyzer.activity.detailfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import sk.styk.martin.apkanalyzer.R
import sk.styk.martin.apkanalyzer.activity.AppDetailFragment
import sk.styk.martin.apkanalyzer.adapter.detaillist.FeatureListAdapter
import sk.styk.martin.apkanalyzer.model.detail.FeatureData

/**
 * @author Martin Styk
 * @version 12.10.2017.
 */
class AppDetailFragment_Feature : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_app_detail_activity, container, false)

        val data = arguments.getParcelableArrayList<FeatureData>(AppDetailFragment.ARG_CHILD)

        val rvItems = rootView.findViewById<RecyclerView>(R.id.recycler_view_activity)

        val adapter = FeatureListAdapter(data!!)
        rvItems.adapter = adapter
        rvItems.setHasFixedSize(true)

        return rootView
    }
}