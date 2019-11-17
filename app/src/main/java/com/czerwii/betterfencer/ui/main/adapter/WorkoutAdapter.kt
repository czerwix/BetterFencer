package com.czerwii.betterfencer.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.czerwii.betterfencer.R
import com.czerwii.betterfencer.ui.main.SHARED_PREFERENCES
import com.czerwii.betterfencer.ui.main.WorkoutItem
import kotlinx.android.synthetic.main.workout_element.view.*

const val DEFAULT_SETS = 3
const val DEFAULT_REPS = 5

class WorkoutAdapter(var data: List<WorkoutItem>) :
    RecyclerView.Adapter<WorkoutElementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        WorkoutElementViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.workout_element,
                parent,
                false
            )
        )

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: WorkoutElementViewHolder, position: Int) =
        with(holder.view) {
            val element = data[position]
            val sharedPreferences =
                context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE)

            Glide.with(context).load(element.demoGif).into(workoutImage)

            titleText.text = element.title
            repsGuidLabelText.text = element.repsTitle
            repsText.text = element.repsText
            guidLabelText.text = element.guidTitle
            workoutStepsText.text = element.guidText
            explanationLabelText.text = element.explanationTitle
            explanationText.text = element.explanationText
            progressionLabelText.text = element.progressionTitle
            progressionText.text = element.progressionText

            setsNumberText.text = sharedPreferences.getInt(element.sets, DEFAULT_SETS).toString()
            repsNumberText.text = sharedPreferences.getInt(element.reps, DEFAULT_REPS).toString()

            setsIncreaseButton.setOnClickListener {
                val newValue = (setsNumberText.text as String).toInt() + 1
                sharedPreferences.edit()
                    .putInt(element.sets, newValue).apply()

                setsNumberText.text = newValue.toString()
            }
            setsDecreaseButton.setOnClickListener {
                val newValue = (setsNumberText.text as String).toInt() - 1
                sharedPreferences.edit()
                    .putInt(element.sets, newValue).apply()

                setsNumberText.text = newValue.toString()
            }

            repsIncreaseButton.setOnClickListener {
                val newValue = (repsNumberText.text as String).toInt() + 1
                sharedPreferences.edit()
                    .putInt(element.reps, newValue).apply()

                repsNumberText.text = newValue.toString()
            }
            repsDecreaseButton.setOnClickListener {
                val newValue = (repsNumberText.text as String).toInt() - 1
                sharedPreferences.edit()
                    .putInt(element.reps, newValue).apply()

                repsNumberText.text = newValue.toString()
            }
        }
}