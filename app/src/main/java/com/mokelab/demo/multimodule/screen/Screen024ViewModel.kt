package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data231RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data232RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data233RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data234RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data235RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data236RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data237RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data238RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data239RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data240RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen024ViewModel @Inject constructor(
    private val repo1: Data231RepositoryImpl,
    private val repo2: Data232RepositoryImpl,
    private val repo3: Data233RepositoryImpl,
    private val repo4: Data234RepositoryImpl,
    private val repo5: Data235RepositoryImpl,
    private val repo6: Data236RepositoryImpl,
    private val repo7: Data237RepositoryImpl,
    private val repo8: Data238RepositoryImpl,
    private val repo9: Data239RepositoryImpl,
    private val repo10: Data240RepositoryImpl,

): ViewModel() {
}
