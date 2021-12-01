package example.irina.mynewaplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class UserAdapter(private val userList: List<User>) : RecyclerView.Adapter<UserViewHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.user_list_item, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}

// адаптер всегда принимает какой-то список

// getItemCount - просит вернуть список пользователей
// onCreateViewHolder - создает отдельный объект для вьхолдера
// val itemView - создаем itemView, LayoutInflater - создает вьюшку