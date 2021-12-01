package example.irina.mynewaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    lateinit var userRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList:List<User> = listOf(
            User("Ivan",20),
            User("Anna", 19),
            User("Elena",21),
            User("Maxim",100)
        )

        userRecyclerView = findViewById(R.id.user_recycler_view)
        userRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(userList)


    }
}

// RecyclerView <- Adapter <- ViewHolder <- Layout
// 1. LayoutManager
// 2. Adapter - натягивает элементы на список

// RecyclerView - оптимизирован для приложения в плане памяти
// (будет рисовать из списка какое-то число эл, а не весть большой список
// Adapter - натягивает элементы на список
// ViewHolder -  натягивает данные на элементы
// Layout - сам элемент(картички, кнопочки, эл списка)  DONE

// LinearLayoutManager(контекст, ориентация, перевернуть или нет)

// this - активити может прикидываться контекстом
// reverseLayout:Boolean - то есть переворачивать или нет - false (нет)

// нужно создать адаптер, для этого нужно создать вьюхолдер, а для этого элемент для верстки

// делаем верстку для элементов в активити _мейн

