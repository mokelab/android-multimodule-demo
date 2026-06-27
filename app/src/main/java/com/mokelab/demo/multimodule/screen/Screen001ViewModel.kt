package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data001RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data002RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data003RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data004RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data005RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data006RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data007RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data008RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data009RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data010RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen001ViewModel @Inject constructor(
    private val repo1: Data001RepositoryImpl,
    private val repo2: Data002RepositoryImpl,
    private val repo3: Data003RepositoryImpl,
    private val repo4: Data004RepositoryImpl,
    private val repo5: Data005RepositoryImpl,
    private val repo6: Data006RepositoryImpl,
    private val repo7: Data007RepositoryImpl,
    private val repo8: Data008RepositoryImpl,
    private val repo9: Data009RepositoryImpl,
    private val repo10: Data010RepositoryImpl,

): ViewModel() {
}
