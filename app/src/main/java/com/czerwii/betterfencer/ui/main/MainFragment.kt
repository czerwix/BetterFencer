package com.czerwii.betterfencer.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.czerwii.betterfencer.R
import com.czerwii.betterfencer.ui.main.adapter.WorkoutAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.main_fragment.view.*

const val SHARED_PREFERENCES = "BETTER_FENCER_SHARED_PREF"

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false).apply {
            val data = getData()

            viewpager.adapter = WorkoutAdapter(data)
            TabLayoutMediator(tabLayout, viewpager) { tab, position ->
                tab.text = data[position].titleShort
            }.attach()
        }
    }

    private fun getData() = listOf(
        WorkoutItem(
            getString(R.string.lateral_broad_jump_title),
            getString(R.string.lateral_broad_jump_title_short),
            getString(R.string.lateral_broad_jump_guid_title),
            getString(R.string.lateral_broad_jump_guid_text),
            getString(R.string.lateral_broad_jump_reps_title),
            getString(R.string.lateral_broad_jump_reps_text),
            getString(R.string.lateral_broad_jump_explanation_title),
            getString(R.string.lateral_broad_jump_explanation_text),
            getString(R.string.lateral_broad_jump_progression_title),
            getString(R.string.lateral_broad_jump_progression_text),
            R.drawable.lateral_broad_jump,
            getString(R.string.lat_set),
            getString(R.string.lat_rep)
        ),
        WorkoutItem(
            getString(R.string.the_standing_long_jump_title),
            getString(R.string.the_standing_long_jump_title_short),
            getString(R.string.the_standing_long_jump_guid_title),
            getString(R.string.the_standing_long_jump_guid_text),
            getString(R.string.the_standing_long_jump_reps_title),
            getString(R.string.the_standing_long_jump_reps_text),
            getString(R.string.the_standing_long_jump_explanation_title),
            getString(R.string.the_standing_long_jump_explanation_text),
            getString(R.string.the_standing_long_jump_progression_title),
            getString(R.string.the_standing_long_jump_progression_text),
            R.drawable.standing_long_jump,
            getString(R.string.stan_set),
            getString(R.string.stan_rep)
        ),
        WorkoutItem(
            getString(R.string.speed_skaters_title),
            getString(R.string.speed_skaters_title_short),
            getString(R.string.the_standing_long_jump_guid_title),
            getString(R.string.speed_skaters_guid_text),
            getString(R.string.speed_skaters_reps_title),
            getString(R.string.speed_skaters_reps_text),
            getString(R.string.speed_skaters_explanation_title),
            getString(R.string.speed_skaters_explanation_text),
            getString(R.string.speed_skaters_progression_title),
            getString(R.string.speed_skaters_progression_text),
            R.drawable.speed_skates,
            getString(R.string.speed_set),
            getString(R.string.speed_rep)
        ),
        WorkoutItem(
            getString(R.string.the_reverse_long_jump_title),
            getString(R.string.the_reverse_long_jump_title_short),
            getString(R.string.the_reverse_long_jump_guid_title),
            getString(R.string.the_reverse_long_jump_guid_text),
            getString(R.string.the_reverse_long_reps_title),
            getString(R.string.the_reverse_long_reps_text),
            getString(R.string.the_reverse_long_jump_explanation_title),
            getString(R.string.the_reverse_long_jump_explanation_text),
            getString(R.string.the_reverse_long_jump_progression_title),
            getString(R.string.the_reverse_long_jump_progression_text),
            R.drawable.reverse_long_jump,
            getString(R.string.rev_set),
            getString(R.string.rev_rep)
        ),
        WorkoutItem(
            getString(R.string.the_pistol_squat_title),
            getString(R.string.the_pistol_squat_title_short),
            getString(R.string.the_pistol_squat_guid_title),
            getString(R.string.the_pistol_squat_guid_text),
            getString(R.string.the_pistol_squat_reps_title),
            getString(R.string.the_pistol_squat_reps_text),
            getString(R.string.the_pistol_squat_explanation_title),
            getString(R.string.the_pistol_squat_explanation_text),
            getString(R.string.the_pistol_squat_progression_title),
            getString(R.string.the_pistol_squat_progression_text),
            R.drawable.pistol_squat,
            getString(R.string.pis_set),
            getString(R.string.pis_rep)
        ),
        WorkoutItem(
            getString(R.string.the_vertical_jump_title),
            getString(R.string.the_vertical_jump_title_short),
            getString(R.string.the_vertical_jump_guid_title),
            getString(R.string.the_vertical_jump_guid_text),
            getString(R.string.the_vertical_jump_reps_title),
            getString(R.string.the_vertical_jump_reps_text),
            getString(R.string.the_vertical_jump_explanation_title),
            getString(R.string.the_vertical_jump_explanation_text),
            getString(R.string.the_vertical_jump_progression_title),
            getString(R.string.the_vertical_jump_progression_text),
            R.drawable.vertical_jump,
            getString(R.string.ver_set),
            getString(R.string.ver_rep)
        ),
        WorkoutItem(
            getString(R.string.band_thrusts_title),
            getString(R.string.band_thrusts_title_short),
            getString(R.string.band_thrusts_guid_title),
            getString(R.string.band_thrusts_guid_text),
            getString(R.string.band_thrusts_reps_title),
            getString(R.string.band_thrusts_reps_text),
            getString(R.string.band_thrusts_explanation_title),
            getString(R.string.band_thrusts_explanation_text),
            getString(R.string.band_thrusts_progression_title),
            getString(R.string.band_thrusts_progression_text),
            R.drawable.band_thrusts,
            getString(R.string.ban_set),
            getString(R.string.ban_rep)
        ),
        WorkoutItem(
            getString(R.string.the_medicine_ball_toss_title),
            getString(R.string.the_medicine_ball_toss_title_short),
            getString(R.string.the_medicine_ball_toss_guid_title),
            getString(R.string.the_medicine_ball_toss_guid_text),
            getString(R.string.the_medicine_ball_toss_reps_title),
            getString(R.string.the_medicine_ball_toss_reps_text),
            getString(R.string.the_medicine_ball_toss_explanation_title),
            getString(R.string.the_medicine_ball_toss_explanation_text),
            getString(R.string.the_medicine_ball_toss_progression_title),
            getString(R.string.the_medicine_ball_toss_progression_text),
            R.drawable.medicine_ball_toss,
            getString(R.string.med_set),
            getString(R.string.med_rep)
        ),
        WorkoutItem(
            getString(R.string.the_bench_dip_title),
            getString(R.string.the_bench_dip_title_short),
            getString(R.string.the_bench_dip_guid_title),
            getString(R.string.the_bench_dip_guid_text),
            getString(R.string.the_bench_dip_toss_reps_title),
            getString(R.string.the_bench_dip_toss_reps_text),
            getString(R.string.the_bench_dip_explanation_title),
            getString(R.string.the_bench_dip_explanation_text),
            getString(R.string.the_bench_dip_progression_title),
            getString(R.string.the_bench_dip_progression_text),
            R.drawable.bench_dip,
            getString(R.string.ben_set),
            getString(R.string.ben_rep)
        ),
        WorkoutItem(
            getString(R.string.the_trunk_swivel_title),
            getString(R.string.the_trunk_swivel_title_short),
            getString(R.string.the_trunk_swivel_guid_title),
            getString(R.string.the_trunk_swivel_guid_text),
            getString(R.string.the_trunk_swivel_reps_title),
            getString(R.string.the_trunk_swivel_reps_text),
            getString(R.string.the_trunk_swivel_explanation_title),
            getString(R.string.the_trunk_swivel_explanation_text),
            getString(R.string.the_trunk_swivel_progression_title),
            getString(R.string.the_trunk_swivel_progression_text),
            R.drawable.trunk_swivel,
            getString(R.string.tru_set),
            getString(R.string.tru_rep)
        ),
        WorkoutItem(
            getString(R.string.plank_title),
            getString(R.string.plank_title_short),
            getString(R.string.plank_guid_title),
            getString(R.string.plank_guid_text),
            getString(R.string.plank_reps_title),
            getString(R.string.plank_reps_text),
            getString(R.string.plank_explanation_title),
            getString(R.string.plank_explanation_text),
            getString(R.string.plank_progression_title),
            getString(R.string.plank_progression_text),
            R.drawable.plank,
            getString(R.string.pla_set),
            getString(R.string.pla_rep)
        ),
        WorkoutItem(
            getString(R.string.the_reverse_fly_title),
            getString(R.string.the_reverse_fly_title_short),
            getString(R.string.the_reverse_fly_guid_title),
            getString(R.string.the_reverse_fly_guid_text),
            getString(R.string.the_reverse_fly_reps_title),
            getString(R.string.the_reverse_fly_reps_text),
            getString(R.string.the_reverse_fly_explanation_title),
            getString(R.string.the_reverse_fly_explanation_text),
            getString(R.string.the_reverse_fly_progression_title),
            getString(R.string.the_reverse_fly_progression_text),
            R.drawable.reverse_fly,
            getString(R.string.rev_fly_set),
            getString(R.string.rev_fly_rep)
        )
    )
}
