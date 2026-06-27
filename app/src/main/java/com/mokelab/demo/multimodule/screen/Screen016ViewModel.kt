package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data151RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data152RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data153RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data154RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data155RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data156RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data157RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data158RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data159RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data160RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen016ViewModel @Inject constructor(
    private val repo1: Data151RepositoryImpl,
    private val repo2: Data152RepositoryImpl,
    private val repo3: Data153RepositoryImpl,
    private val repo4: Data154RepositoryImpl,
    private val repo5: Data155RepositoryImpl,
    private val repo6: Data156RepositoryImpl,
    private val repo7: Data157RepositoryImpl,
    private val repo8: Data158RepositoryImpl,
    private val repo9: Data159RepositoryImpl,
    private val repo10: Data160RepositoryImpl,

): ViewModel() {
}
