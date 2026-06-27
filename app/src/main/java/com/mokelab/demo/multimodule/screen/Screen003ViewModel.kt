package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data021RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data022RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data023RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data024RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data025RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data026RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data027RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data028RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data029RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data030RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen003ViewModel @Inject constructor(
    private val repo1: Data021RepositoryImpl,
    private val repo2: Data022RepositoryImpl,
    private val repo3: Data023RepositoryImpl,
    private val repo4: Data024RepositoryImpl,
    private val repo5: Data025RepositoryImpl,
    private val repo6: Data026RepositoryImpl,
    private val repo7: Data027RepositoryImpl,
    private val repo8: Data028RepositoryImpl,
    private val repo9: Data029RepositoryImpl,
    private val repo10: Data030RepositoryImpl,

): ViewModel() {
}
