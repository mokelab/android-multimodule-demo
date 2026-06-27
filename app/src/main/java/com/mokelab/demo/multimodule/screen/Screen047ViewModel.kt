package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data461RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data462RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data463RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data464RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data465RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data466RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data467RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data468RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data469RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data470RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen047ViewModel @Inject constructor(
    private val repo1: Data461RepositoryImpl,
    private val repo2: Data462RepositoryImpl,
    private val repo3: Data463RepositoryImpl,
    private val repo4: Data464RepositoryImpl,
    private val repo5: Data465RepositoryImpl,
    private val repo6: Data466RepositoryImpl,
    private val repo7: Data467RepositoryImpl,
    private val repo8: Data468RepositoryImpl,
    private val repo9: Data469RepositoryImpl,
    private val repo10: Data470RepositoryImpl,

): ViewModel() {
}
