package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data321RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data322RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data323RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data324RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data325RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data326RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data327RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data328RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data329RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data330RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen033ViewModel @Inject constructor(
    private val repo1: Data321RepositoryImpl,
    private val repo2: Data322RepositoryImpl,
    private val repo3: Data323RepositoryImpl,
    private val repo4: Data324RepositoryImpl,
    private val repo5: Data325RepositoryImpl,
    private val repo6: Data326RepositoryImpl,
    private val repo7: Data327RepositoryImpl,
    private val repo8: Data328RepositoryImpl,
    private val repo9: Data329RepositoryImpl,
    private val repo10: Data330RepositoryImpl,

): ViewModel() {
}
