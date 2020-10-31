package co.estudos.pbscanpet_k

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.activity_cad_owner.*

class CadOwnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_owner)

        btnNext.setOnClickListener{
            val intent = Intent(this, CadOwnerActivity2::class.java)
            startActivity(intent)
        }


        //Crate a new Bundle to pass values to CadOwnerActivity2

        val bundle = bundleOf("name" to editTxtName)
       // val navigate: Any = view.findNavController().navigate(R.id.txtViewYourName, bundle)


    }
}