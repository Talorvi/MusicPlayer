package com.loopmoth.musicplayer

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [music_player.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [music_player.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class music_player : Fragment() {
    companion object {

        fun newInstance(): music_player {
            return music_player()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_music_player, container, false)
    }
}
