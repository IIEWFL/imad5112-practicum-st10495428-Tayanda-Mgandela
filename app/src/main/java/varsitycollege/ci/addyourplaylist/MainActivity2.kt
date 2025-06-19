package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Lists to store song info
    private val playlistTitles = ArrayList<String>()
    private val playlistArtists = ArrayList<String>()
    private val playlistRatings = ArrayList<Int>()
    private val playlistComments = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addSongButton = findViewById<Button>(R.id.btnAdd)
        val viewSongsButton = findViewById<Button>(R.id.btnView)
        val exitAppButton = findViewById<Button>(R.id.btnExit)

        // When user clicks "Add to Playlist"
        addSongButton.setOnClickListener {
            // Dummy data for demo – you can later replace with input fields
            val newTitle = "New Song"
            val newArtist = "New Artist"
            val newRating = 5
            val newComment = "Hip-Hop"

            playlistTitles.add(newTitle)
            playlistArtists.add(newArtist)
            playlistRatings.add(newRating)
            playlistComments.add(newComment)

            Toast.makeText(this, "Song added to playlist!", Toast.LENGTH_SHORT).show()
        }

        // When user clicks "View Playlist"
        viewSongsButton.setOnClickListener {
            val intentToDetails = Intent(this, DetailActivity::class.java)

            // Pass array data to DetailActivity
            intentToDetails.putStringArrayListExtra("titles", playlistTitles)
            intentToDetails.putStringArrayListExtra("artists", playlistArtists)
            intentToDetails.putIntegerArrayListExtra("ratings", ArrayList(playlistRatings))
            intentToDetails.putStringArrayListExtra("comments", playlistComments)

            startActivity(intentToDetails)
        }

        // When user clicks "Exit App"
        exitAppButton.setOnClickListener {
            finish()  // Close the app
        }
    }
}