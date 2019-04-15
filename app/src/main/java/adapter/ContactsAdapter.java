package adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.topic5.DetailsActivity;
import com.example.topic5.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;
import model.Contacts;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contacts> contactsList;
    // Constructor
    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.contact,viewGroup,false);
       return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        final Contacts contacts = contactsList.get(i);

        contactsViewHolder.imgProfile.setImageResource(contacts.getImage());
        contactsViewHolder.tvName.setText(contacts.getName());
        contactsViewHolder.tvPhone.setText(contacts.getPhoneNo());

        //Adding click listener in an imageview
        contactsViewHolder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailsActivity.class);

                intent.putExtra("image",contacts.getImage());
                intent.putExtra("name",contacts.getName());
                intent.putExtra("phone",contacts.getPhoneNo());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
       return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgProfile;
        TextView tvName,tvPhone;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }
    }
}