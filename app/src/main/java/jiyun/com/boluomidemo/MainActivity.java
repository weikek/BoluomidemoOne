package jiyun.com.boluomidemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Bind(R.id.name)
    EditText name;
    @Bind(R.id.password)
    EditText password;
    @Bind(R.id.img_wen)
    ImageView imgWen;
    @Bind(R.id.main_login)
    Button mainLogin;
    @Bind(R.id.main_regist)
    Button mainRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.img_wen, R.id.main_login, R.id.main_regist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_wen:
                break;
            case R.id.main_login:
                startActivity(new Intent(this,HomeActivity.class));
                break;
            case R.id.main_regist:
                startActivity(new Intent(this,RegistActivity.class));
                break;
        }
    }

}
