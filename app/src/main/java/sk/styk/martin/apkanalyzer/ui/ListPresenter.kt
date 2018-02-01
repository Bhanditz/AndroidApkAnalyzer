package sk.styk.martin.apkanalyzer.ui

import android.support.v7.widget.RecyclerView
import sk.styk.martin.apkanalyzer.ui.activity.appdetail.page.ListDetailPageContract

/**
 * Interface representing a ListPresenter in a model view presenter (MVP) pattern.
 *
 * Offers method for use in RecyclerView adapter
 *
 * @author Martin Styk
 * @version 28.01.2018.
 */
interface ListPresenter<in ITEM> {

    /**
     * Number of items in collection
     */
    fun itemCount(): Int

    /**
     * Binds item to view holder
     */
    fun onBindViewOnPosition(position: Int, holder: ITEM)
}