package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data751RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data752RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data753RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data754RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data755RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data756RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data757RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data758RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data759RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data760RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen076ViewModel @Inject constructor(
    private val repo1: Data751RepositoryImpl,
    private val repo2: Data752RepositoryImpl,
    private val repo3: Data753RepositoryImpl,
    private val repo4: Data754RepositoryImpl,
    private val repo5: Data755RepositoryImpl,
    private val repo6: Data756RepositoryImpl,
    private val repo7: Data757RepositoryImpl,
    private val repo8: Data758RepositoryImpl,
    private val repo9: Data759RepositoryImpl,
    private val repo10: Data760RepositoryImpl,

): ViewModel() {
}
