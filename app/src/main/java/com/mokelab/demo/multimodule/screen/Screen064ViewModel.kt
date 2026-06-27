package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data631RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data632RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data633RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data634RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data635RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data636RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data637RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data638RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data639RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data640RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen064ViewModel @Inject constructor(
    private val repo1: Data631RepositoryImpl,
    private val repo2: Data632RepositoryImpl,
    private val repo3: Data633RepositoryImpl,
    private val repo4: Data634RepositoryImpl,
    private val repo5: Data635RepositoryImpl,
    private val repo6: Data636RepositoryImpl,
    private val repo7: Data637RepositoryImpl,
    private val repo8: Data638RepositoryImpl,
    private val repo9: Data639RepositoryImpl,
    private val repo10: Data640RepositoryImpl,

): ViewModel() {
}
