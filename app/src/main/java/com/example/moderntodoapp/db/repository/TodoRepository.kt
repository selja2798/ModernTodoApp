package com.example.moderntodoapp.db.repository

import androidx.lifecycle.LiveData
import com.example.moderntodoapp.db.TodoDAO
import com.example.moderntodoapp.db.models.TodoData

class TodoRepository(private val todoDAO: TodoDAO) {

    val getAllData: LiveData<List<TodoData>> = todoDAO.getAllData()
    val sortByLowPriority: LiveData<List<TodoData>> = todoDAO.sortByLowPriority()
    val sortByHighPriority: LiveData<List<TodoData>> = todoDAO.sortByHighPriority()

    suspend fun insertData(todoData: TodoData) {
        todoDAO.insertData(todoData)
    }

    suspend fun updateData(todoData: TodoData) {
        todoDAO.updateData(todoData)
    }

    suspend fun deleteData(todoData: TodoData) {
        todoDAO.deleteData(todoData)
    }

    suspend fun deleteAll() {
        todoDAO.deleteAll()
    }

    fun searchQuery(searchQuery: String): LiveData<List<TodoData>> {
        return todoDAO.searchQuery(searchQuery)
    }

}