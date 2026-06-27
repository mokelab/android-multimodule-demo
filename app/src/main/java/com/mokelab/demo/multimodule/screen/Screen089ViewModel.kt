package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data881RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data882RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data883RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data884RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data885RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data886RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data887RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data888RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data889RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data890RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen089ViewModel @Inject constructor(
    private val repo1: Data881RepositoryImpl,
    private val repo2: Data882RepositoryImpl,
    private val repo3: Data883RepositoryImpl,
    private val repo4: Data884RepositoryImpl,
    private val repo5: Data885RepositoryImpl,
    private val repo6: Data886RepositoryImpl,
    private val repo7: Data887RepositoryImpl,
    private val repo8: Data888RepositoryImpl,
    private val repo9: Data889RepositoryImpl,
    private val repo10: Data890RepositoryImpl,

): ViewModel() {
}
