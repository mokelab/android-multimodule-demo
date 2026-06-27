package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data201RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data202RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data203RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data204RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data205RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data206RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data207RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data208RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data209RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data210RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen021ViewModel @Inject constructor(
    private val repo1: Data201RepositoryImpl,
    private val repo2: Data202RepositoryImpl,
    private val repo3: Data203RepositoryImpl,
    private val repo4: Data204RepositoryImpl,
    private val repo5: Data205RepositoryImpl,
    private val repo6: Data206RepositoryImpl,
    private val repo7: Data207RepositoryImpl,
    private val repo8: Data208RepositoryImpl,
    private val repo9: Data209RepositoryImpl,
    private val repo10: Data210RepositoryImpl,

): ViewModel() {
}
