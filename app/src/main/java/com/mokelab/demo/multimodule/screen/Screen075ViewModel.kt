package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data741RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data742RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data743RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data744RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data745RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data746RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data747RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data748RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data749RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data750RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen075ViewModel @Inject constructor(
    private val repo1: Data741RepositoryImpl,
    private val repo2: Data742RepositoryImpl,
    private val repo3: Data743RepositoryImpl,
    private val repo4: Data744RepositoryImpl,
    private val repo5: Data745RepositoryImpl,
    private val repo6: Data746RepositoryImpl,
    private val repo7: Data747RepositoryImpl,
    private val repo8: Data748RepositoryImpl,
    private val repo9: Data749RepositoryImpl,
    private val repo10: Data750RepositoryImpl,

): ViewModel() {
}
