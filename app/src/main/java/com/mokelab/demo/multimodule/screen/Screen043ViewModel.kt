package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data421RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data422RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data423RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data424RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data425RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data426RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data427RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data428RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data429RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data430RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen043ViewModel @Inject constructor(
    private val repo1: Data421RepositoryImpl,
    private val repo2: Data422RepositoryImpl,
    private val repo3: Data423RepositoryImpl,
    private val repo4: Data424RepositoryImpl,
    private val repo5: Data425RepositoryImpl,
    private val repo6: Data426RepositoryImpl,
    private val repo7: Data427RepositoryImpl,
    private val repo8: Data428RepositoryImpl,
    private val repo9: Data429RepositoryImpl,
    private val repo10: Data430RepositoryImpl,

): ViewModel() {
}
