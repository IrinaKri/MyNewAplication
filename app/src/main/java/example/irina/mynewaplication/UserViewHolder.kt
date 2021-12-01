package example.irina.mynewaplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    private val ageTextView: TextView = itemView.findViewById(R.id.age_text_view)

    fun bind(user: User) {

        nameTextView.text = "Имя - ${user.name}"
        ageTextView.text = "Возраст - ${user.age}"
    }

}

// "Имя - ${user.name}" - $ означает, что надо взять значение из фигурных скобок,
// преобразовать в стринг и поместить в текстовое поле
// itemView - обязательный параметр для вьюхолдера, возьмется из адаптера, когда будет написан

// bind - принимает юзера
// приватность  - это значит, что можно пользоваться только в этом поле