package com.szaporozhets.ktornoteapp.ui

import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.szaporozhets.ktornoteapp.R

abstract class BaseFragment(layoutId: Int) : Fragment(layoutId) {

    fun showSnackbar(text: String) {
        Snackbar.make(
            requireActivity().findViewById(R.id.rootLayout),
            text,
            Snackbar.LENGTH_LONG
        ).show()
    }
}