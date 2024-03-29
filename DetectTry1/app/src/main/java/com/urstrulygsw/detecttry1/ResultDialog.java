package com.urstrulygsw.detecttry1;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {

    private Button okButton;
    private TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_result,container,false);
        String result="";
        okButton=view.findViewById(R.id.btnOk);
        txtResult=view.findViewById(R.id.txtViewResult);

        Bundle bundle=getArguments();
        result=bundle.getString(FaceDetection.strRESULT);
        txtResult.setText(result);

        //till this point message must display

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();

            }
        });
        return view;
    }
}
