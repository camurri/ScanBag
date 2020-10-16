package co.estudos.pbscanpet_k

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cad_pet2.*

class CadPetActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_pet2)






        /*when the button btnDone is pressed, it will calls the createAnimal() fun
         and before createAnimal() ends, it will return to the MenuActivity
         by the intent.
         It's important to know that by exception in case of the update fails, a message
         toast must be displayed for the user of the system.
        */

        btnDone.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)

        }




    }



    /*Here is fun selectPhoto()
    Basically this fun is responsible for
    get images from gallery. Take look above.
     */
    fun selectPhoto(){
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, 0)
    }



}