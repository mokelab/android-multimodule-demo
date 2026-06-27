package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data551RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data552RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data553RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data554RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data555RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data556RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data557RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data558RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data559RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data560RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen056ViewModel @Inject constructor(
    private val repo1: Data551RepositoryImpl,
    private val repo2: Data552RepositoryImpl,
    private val repo3: Data553RepositoryImpl,
    private val repo4: Data554RepositoryImpl,
    private val repo5: Data555RepositoryImpl,
    private val repo6: Data556RepositoryImpl,
    private val repo7: Data557RepositoryImpl,
    private val repo8: Data558RepositoryImpl,
    private val repo9: Data559RepositoryImpl,
    private val repo10: Data560RepositoryImpl,

): ViewModel() {
}
