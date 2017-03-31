package nhatto.com.xulysukienonclickvaonlongclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnResult;
    private EditText edtSoA;
    private EditText edtSoB;
    private int SoA, SoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSoA = (EditText)findViewById(R.id.edt_soA);
        edtSoB = (EditText)findViewById(R.id.edt_soB);
        btnResult = (Button)findViewById(R.id.btn_result);

        btnResult.setOnClickListener(this);

//        btnResult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!edtSoA.getText().toString().isEmpty() && !edtSoB.getText().toString().isEmpty()){
//                    SoA = Integer.parseInt(edtSoA.getText().toString());
//                    SoB = Integer.parseInt(edtSoB.getText().toString());
//                    Toast.makeText(MainActivity.this, "Kết quả của  "+SoA+" + "+SoB+"  là:" +(SoA+SoB) , Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Vui lòng nhập vào số hợp lệ", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

//        btnResult.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                Toast.makeText(MainActivity.this, "Đây là sự kiện LongClickListener", Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_result:
                if (!edtSoA.getText().toString().isEmpty() && !edtSoB.getText().toString().isEmpty()){
                    SoA = Integer.parseInt(edtSoA.getText().toString());
                    SoB = Integer.parseInt(edtSoB.getText().toString());
                    Toast.makeText(MainActivity.this, "Kết quả của "+SoA+" + "+SoB+" là:" +(SoA+SoB), Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập vào số hợp lệ", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
