package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data961RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data962RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data963RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data964RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data965RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data966RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data967RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data968RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data969RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data970RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen097ViewModel @Inject constructor(
    private val repo1: Data961RepositoryImpl,
    private val repo2: Data962RepositoryImpl,
    private val repo3: Data963RepositoryImpl,
    private val repo4: Data964RepositoryImpl,
    private val repo5: Data965RepositoryImpl,
    private val repo6: Data966RepositoryImpl,
    private val repo7: Data967RepositoryImpl,
    private val repo8: Data968RepositoryImpl,
    private val repo9: Data969RepositoryImpl,
    private val repo10: Data970RepositoryImpl,

): ViewModel() {
}
